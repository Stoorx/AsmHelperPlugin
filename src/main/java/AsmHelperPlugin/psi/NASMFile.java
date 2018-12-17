package AsmHelperPlugin.psi;

import AsmHelperPlugin.AsmFileType;
import AsmHelperPlugin.NASMLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class NASMFile extends PsiFileBase {

    public NASMFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NASMLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return AsmFileType.INSTANCE;
    }
}
