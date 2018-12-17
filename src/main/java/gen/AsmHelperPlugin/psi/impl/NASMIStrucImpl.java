// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import gen.AsmHelperPlugin.psi.NASMExpr;
import gen.AsmHelperPlugin.psi.NASMIStruc;
import gen.AsmHelperPlugin.psi.NASMNumericExpr;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static gen.AsmHelperPlugin.psi.NASMTypes.IEND_TAG;
import static gen.AsmHelperPlugin.psi.NASMTypes.ISTRUC_TAG;

public class NASMIStrucImpl extends ASTWrapperPsiElement implements NASMIStruc {

  public NASMIStrucImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitIStruc(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NASMExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMExpr.class);
  }

  @Override
  @NotNull
  public List<NASMNumericExpr> getNumericExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMNumericExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getIendTag() {
    return findNotNullChildByType(IEND_TAG);
  }

  @Override
  @NotNull
  public PsiElement getIstrucTag() {
    return findNotNullChildByType(ISTRUC_TAG);
  }

}
