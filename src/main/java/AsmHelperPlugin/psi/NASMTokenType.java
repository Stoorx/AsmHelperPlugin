package AsmHelperPlugin.psi;

import AsmHelperPlugin.NASMLanguage;
import com.intellij.psi.tree.IElementType;


public class NASMTokenType extends IElementType {
    public NASMTokenType(String name) {
        super(name, NASMLanguage.INSTANCE);
    }
}
