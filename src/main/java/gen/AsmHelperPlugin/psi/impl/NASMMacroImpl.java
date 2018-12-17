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

import static gen.AsmHelperPlugin.psi.NASMTypes.*;

public class NASMMacroImpl extends ASTWrapperPsiElement implements NASMMacro {

  public NASMMacroImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitMacro(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NASMData> getDataList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMData.class);
  }

  @Override
  @NotNull
  public List<NASMExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMExpr.class);
  }

  @Override
  @NotNull
  public List<NASMInstruction> getInstructionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMInstruction.class);
  }

  @Override
  @NotNull
  public List<NASMMacroLabel> getMacroLabelList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMMacroLabel.class);
  }

  @Override
  @NotNull
  public List<NASMPreprocessor> getPreprocessorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMPreprocessor.class);
  }

  @Override
  @Nullable
  public PsiElement getMacroEndTag() {
    return findChildByType(MACRO_END_TAG);
  }

  @Override
  @NotNull
  public PsiElement getMacroTag() {
    return findNotNullChildByType(MACRO_TAG);
  }

  @Override
  @Nullable
  public PsiElement getRegister() {
    return findChildByType(REGISTER);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
