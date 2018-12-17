// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMAvx512Op;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMAvx512OpImpl extends ASTWrapperPsiElement implements NASMAvx512Op {

    public NASMAvx512OpImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull NASMVisitor visitor) {
        visitor.visitAvx512Op(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof NASMVisitor) accept((NASMVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Blend() {
        return findChildByType(INS_AVX512_BLEND);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Broadcast() {
        return findChildByType(INS_AVX512_BROADCAST);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Compare() {
        return findChildByType(INS_AVX512_COMPARE);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Compress() {
        return findChildByType(INS_AVX512_COMPRESS);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Conv() {
        return findChildByType(INS_AVX512_CONV);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Logical() {
        return findChildByType(INS_AVX512_LOGICAL);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Math() {
        return findChildByType(INS_AVX512_MATH);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Mov() {
        return findChildByType(INS_AVX512_MOV);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Other() {
        return findChildByType(INS_AVX512_OTHER);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Packed() {
        return findChildByType(INS_AVX512_PACKED);
    }

    @Override
    @Nullable
    public PsiElement getInsAvx512Perm() {
        return findChildByType(INS_AVX512_PERM);
    }

}
