import 'package:#-PROJECT_NAME-#/core/domain/entities/option/port/provider/option_read_provider_port.dart';
import 'package:#-PROJECT_NAME-#/core/domain/entities/option/port/provider/option_update_provider_port.dart';

import 'di.dart';

class ProviderDi extends Di {
  static OptionReadProviderPort getOptionReadProvider(){
    return Di.di.get<OptionReadProviderPort>();
  }

  static OptionUpdateProviderPort getOptionUpdateProvider(){
    return Di.di.get<OptionUpdateProviderPort>();
  }
}