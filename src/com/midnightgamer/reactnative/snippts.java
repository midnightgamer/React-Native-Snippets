package com.midnightgamer.reactnative;

import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.Nullable;
import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;

public class snippts implements DefaultLiveTemplatesProvider
{
    public String[] getDefaultLiveTemplateFiles() {
        return new String[] { "liveTemplates/ReactNative" };
    }

    @Nullable
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }

}
