// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import gen.AsmHelperPlugin.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NASMDirectiveImpl extends ASTWrapperPsiElement implements NASMDirective {

  public NASMDirectiveImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitDirective(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NASMDirectiveArg> getDirectiveArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMDirectiveArg.class);
  }

  @Override
  @Nullable
  public NASMMapOption getMapOption() {
    return findChildByClass(NASMMapOption.class);
  }

  @Override
  @Nullable
  public PsiElement getDirectiveOp() {
      return findChildByType(NASMTypes.DIRECTIVE_OP);
  }

}
