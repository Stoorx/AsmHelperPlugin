// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import gen.AsmHelperPlugin.psi.NASMX64Op;
import org.jetbrains.annotations.NotNull;

import static gen.AsmHelperPlugin.psi.NASMTypes.INS_64_BIT;

public class NASMX64OpImpl extends ASTWrapperPsiElement implements NASMX64Op {

    public NASMX64OpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitX64Op(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PsiElement getIns64Bit() {
        return findNotNullChildByType(INS_64_BIT);
    }

}
