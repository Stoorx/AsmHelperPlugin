// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static AsmHelperPlugin.psi.NASMTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import AsmHelperPlugin.psi.*;

public class NASMConstantImpl extends ASTWrapperPsiElement implements NASMConstant {

  public NASMConstantImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitConstant(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public NASMIdentifier getIdentifier() {
    return findNotNullChildByClass(NASMIdentifier.class);
  }

  @Override
  @NotNull
  public NASMNumericExpr getNumericExpr() {
    return findNotNullChildByClass(NASMNumericExpr.class);
  }

  @Override
  @NotNull
  public PsiElement getEqu() {
    return findNotNullChildByType(EQU);
  }

}
