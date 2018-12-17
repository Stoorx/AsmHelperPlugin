// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static AsmHelperPlugin.psi.NASMTypes.*;
import AsmHelperPlugin.psi.*;

public class NASMSegImpl extends NASMExprImpl implements NASMSeg {

  public NASMSegImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitSeg(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getSegmentRegister() {
    return findNotNullChildByType(SEGMENT_REGISTER);
  }

}
