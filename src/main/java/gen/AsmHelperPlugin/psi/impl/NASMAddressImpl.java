// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMAddress;
import gen.AsmHelperPlugin.psi.NASMExpr;
import gen.AsmHelperPlugin.psi.NASMTypes;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NASMAddressImpl extends NASMExprImpl implements NASMAddress {

  public NASMAddressImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitAddress(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NASMExpr getExpr() {
    return findChildByClass(NASMExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getSizeType() {
      return findChildByType(NASMTypes.SIZE_TYPE);
  }

}
