// This is a generated file. Not intended for manual editing.
package psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static psi.NASMTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import psi.*;

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
    return findChildByType(DIRECTIVE_OP);
  }

}
