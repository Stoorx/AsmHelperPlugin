// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import gen.AsmHelperPlugin.psi.NASMExpr;
import gen.AsmHelperPlugin.psi.NASMMulExpr;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NASMMulExprImpl extends NASMExprImpl implements NASMMulExpr {

  public NASMMulExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitMulExpr(this);
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

}
