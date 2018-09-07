
#import "RNBuildEnv.h"

@implementation RNBuildEnv

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE();

- (NSDictionary*)constantsToExport
{
  NSString* buildEnvironment = [[[NSBundle mainBundle] infoDictionary] valueForKey:@"BuildEnvironment"];
  return @{ @"buildEnvironment": buildEnvironment };
}

@end
  