// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMReg;
import gen.AsmHelperPlugin.psi.NASMTypes;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;

public class NASMRegImpl extends NASMExprImpl implements NASMReg {

  public NASMRegImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitReg(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getRegister() {
      return findNotNullChildByType(NASMTypes.REGISTER);
  }

}
