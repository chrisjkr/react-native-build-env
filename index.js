
import { NativeModules } from 'react-native'

const { RNBuildEnv } = NativeModules

export const buildEnvironment = RNBuildEnv.buildEnvironment

export default RNBuildEnv
