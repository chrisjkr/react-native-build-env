
# react-native-build-env

[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

## Getting started

`$ npm install react-native-build-env --save`

### Mostly automatic installation

`$ react-native link react-native-build-env`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-build-env` and add `RNBuildEnv.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNBuildEnv.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNBuildEnvPackage;` to the imports at the top of the file
  - Add `new RNBuildEnvPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-build-env'
  	project(':react-native-build-env').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-build-env/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-build-env')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNBuildEnv.sln` in `node_modules/react-native-build-env/windows/RNBuildEnv.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Build.Env.RNBuildEnv;` to the usings at the top of the file
  - Add `new RNBuildEnvPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNBuildEnv from 'react-native-build-env';

// TODO: What to do with the module?
RNBuildEnv;
```
  