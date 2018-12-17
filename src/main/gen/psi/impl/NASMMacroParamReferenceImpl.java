// This is a generated file. Not intended for manual editing.
package psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static psi.NASMTypes.*;
import psi.*;

public class NASMMacroParamReferenceImpl extends NASMExprImpl implements NASMMacroParamReference {

  public NASMMacroParamReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitMacroParamReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getMacroParamRef() {
    return findNotNullChildByType(MACRO_PARAM_REF);
  }

  @Override
  @Nullable
  public PsiElement getSizeType() {
    return findChildByType(SIZE_TYPE);
  }

}
