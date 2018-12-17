package AsmHelperPlugin.psi;

import AsmHelperPlugin.NASMLanguage;
import com.intellij.psi.tree.IElementType;

public class NASMElementType extends IElementType {
    public NASMElementType(String name) {
        super(name, NASMLanguage.INSTANCE);
    }
}
