package com.simx.barcodescanner.ui.splash;

import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.simx.barcodescanner.BuildConfig;

public class SplashViewModel extends ViewModel implements Observable {

  private PropertyChangeRegistry callbacks = new PropertyChangeRegistry();
  private LiveData<String> version;


  @Override
  public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
    callbacks.add(callback);
  }

  @Override
  public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
    callbacks.remove(callback);
  }

  /**
   * Notifies observers that all properties of this instance have changed.
   */
  void notifyChange() {
    callbacks.notifyCallbacks(this, 0, null);
  }

  /**
   * Notifies observers that a specific property has changed. The getter for the property that
   * changes should be marked with the @Bindable annotation to generate a field in the BR class to
   * be used as the fieldId parameter.
   *
   * @param fieldId The generated BR id for the Bindable field.
   */

  void notifyPropertyChanged(int fieldId) {
    callbacks.notifyCallbacks(this, fieldId, null);
  }


  public String getVersion() {
    return "Version -"+BuildConfig.VERSION_NAME+"."+BuildConfig.VERSION_CODE;
  }

  public void setVersion(LiveData<String> version) {
    this.version = version;
  }

}
