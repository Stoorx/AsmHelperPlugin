// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import gen.AsmHelperPlugin.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NASMSegmentAddressImpl extends NASMExprImpl implements NASMSegmentAddress {

  public NASMSegmentAddressImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitSegmentAddress(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NASMLabelDefMacro getLabelDefMacro() {
    return findChildByClass(NASMLabelDefMacro.class);
  }

  @Override
  @Nullable
  public NASMMacroCall getMacroCall() {
    return findChildByClass(NASMMacroCall.class);
  }

  @Override
  @Nullable
  public PsiElement getHexadecimal() {
      return findChildByType(NASMTypes.HEXADECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getId() {
      return findChildByType(NASMTypes.ID);
  }

  @Override
  @Nullable
  public PsiElement getLbl() {
      return findChildByType(NASMTypes.LBL);
  }

  @Override
  @Nullable
  public PsiElement getLblDef() {
      return findChildByType(NASMTypes.LBL_DEF);
  }

  @Override
  @Nullable
  public PsiElement getSegmentAddrL() {
      return findChildByType(NASMTypes.SEGMENT_ADDR_L);
  }

  @Override
  @Nullable
  public PsiElement getZeroes() {
      return findChildByType(NASMTypes.ZEROES);
  }

}
