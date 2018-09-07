
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

import com.facebook.react.bridge.Callback;

import com.reactlibrary.BuildConfig;

public class RNBuildEnvModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNBuildEnvModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNBuildEnv";
  }

  @Nullable
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put("buildEnvironment", BuildConfig.BUILD_ENV);
    return constants;
  }
}