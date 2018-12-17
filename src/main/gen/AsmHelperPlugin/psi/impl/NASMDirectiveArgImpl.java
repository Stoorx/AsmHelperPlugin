// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import AsmHelperPlugin.psi.*;

public class NASMDirectiveArgImpl extends ASTWrapperPsiElement implements NASMDirectiveArg {

  public NASMDirectiveArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitDirectiveArg(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NASMExpr getExpr() {
    return findNotNullChildByClass(NASMExpr.class);
  }

}
