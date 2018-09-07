
# react-native-build-env

Configure your app based on the build environment (iOS/Android)

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

## Usage
```javascript
import { buildEnvironment } from 'react-native-build-env'

console.log(buildEnvironment)
```
  