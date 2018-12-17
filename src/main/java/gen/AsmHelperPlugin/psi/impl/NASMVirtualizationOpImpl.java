// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMVirtualizationOp;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.INS_AMD_SVM;
import static gen.AsmHelperPlugin.psi.NASMTypes.INS_INTEL_VMX;

public class NASMVirtualizationOpImpl extends ASTWrapperPsiElement implements NASMVirtualizationOp {

    public NASMVirtualizationOpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitVirtualizationOp(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsAmdSvm() {
        return findChildByType(INS_AMD_SVM);
    }

    @Override
    @Nullable
    public PsiElement getInsIntelVmx() {
        return findChildByType(INS_INTEL_VMX);
    }

}
