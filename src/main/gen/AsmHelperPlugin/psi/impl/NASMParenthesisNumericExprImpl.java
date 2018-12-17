// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import AsmHelperPlugin.psi.*;

public class NASMParenthesisNumericExprImpl extends NASMNumericExprImpl implements NASMParenthesisNumericExpr {

  public NASMParenthesisNumericExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitParenthesisNumericExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NASMNumericExpr getNumericExpr() {
    return findChildByClass(NASMNumericExpr.class);
  }

}
