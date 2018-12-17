package AsmHelperPlugin.psi;

import AsmHelperPlugin.AsmFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import gen.AsmHelperPlugin.psi.NASMIdentifier;

public class NASMElementFactory {

    public static NASMIdentifier createIdentifier(Project project, String name) {
        final NASMFile file = createFile(project, name);
        return (NASMIdentifier) file.getFirstChild();
    }

    public static NASMFile createFile(Project project, String text) {
        String name = "dummy.create.asm";
        return (NASMFile) PsiFileFactory.getInstance(project).createFileFromText(name, AsmFileType.INSTANCE, text);
    }
}