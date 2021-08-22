package core.application.commands.init_command;

import core.infrastructure.config.Params;

import java.util.Arrays;
import java.util.HashMap;

public class InitAttributes {
    private final OverwriteMode overwriteMode;
    private final OverwriteMode defaultOverwriteMode = OverwriteMode.force;

    public InitAttributes(String[] args) {
        if(args.length == 0) {
            overwriteMode = defaultOverwriteMode;
            return;
        }

        HashMap<String,OverwriteMode> modesMap = new HashMap<String,OverwriteMode>();
        modesMap.put(Params.INIT_COMMAND_FORCE_MODE_PARAM, OverwriteMode.force);
        modesMap.put(Params.INIT_COMMAND_SOFT_MODE_PARAM, OverwriteMode.soft);
        modesMap.put(Params.INIT_COMMAND_ONLY_PUBSPEC_FORCE_MODE_PARAM, OverwriteMode.only_pubspec_force);

        String[] availableParams = {
            Params.INIT_COMMAND_FORCE_MODE_PARAM,
            Params.INIT_COMMAND_SOFT_MODE_PARAM,
            Params.INIT_COMMAND_ONLY_PUBSPEC_FORCE_MODE_PARAM,
        };

        for (int i=0; i < args.length; i++){
            String arg = args[i];
            if(modesMap.containsKey(arg)) {
                overwriteMode = modesMap.get(arg);
                return;
            }
        }

        overwriteMode = defaultOverwriteMode;
    }

    public OverwriteMode getOverwriteMode() {
        return overwriteMode;
    }
}
