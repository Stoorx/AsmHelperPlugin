package AsmHelperPlugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AsmFileType extends LanguageFileType {
    public static final AsmFileType INSTANCE = new AsmFileType();

    private AsmFileType() {
        super(NASMLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Assembly file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Assembly file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "asm";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AsmIcons.ASM_FILE_TYPE_ICON;
    }
}
