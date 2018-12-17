// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.NASMLabelDefMacro;
import gen.AsmHelperPlugin.psi.NASMMacroCall;
import gen.AsmHelperPlugin.psi.NASMVisitor;
import org.jetbrains.annotations.NotNull;

public class NASMLabelDefMacroImpl extends ASTWrapperPsiElement implements NASMLabelDefMacro {

  public NASMLabelDefMacroImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitLabelDefMacro(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NASMMacroCall getMacroCall() {
    return findNotNullChildByClass(NASMMacroCall.class);
  }

}
