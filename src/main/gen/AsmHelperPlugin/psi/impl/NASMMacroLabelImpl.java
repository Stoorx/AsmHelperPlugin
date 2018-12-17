// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static AsmHelperPlugin.psi.NASMTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import AsmHelperPlugin.psi.*;

public class NASMMacroLabelImpl extends ASTWrapperPsiElement implements NASMMacroLabel {

  public NASMMacroLabelImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitMacroLabel(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NASMData getData() {
    return findChildByClass(NASMData.class);
  }

  @Override
  @Nullable
  public NASMInstruction getInstruction() {
    return findChildByClass(NASMInstruction.class);
  }

  @Override
  @NotNull
  public PsiElement getMacroParamLblDef() {
    return findNotNullChildByType(MACRO_PARAM_LBL_DEF);
  }

}
