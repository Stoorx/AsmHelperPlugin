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
    return findChildByType(HEXADECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

  @Override
  @Nullable
  public PsiElement getLbl() {
    return findChildByType(LBL);
  }

  @Override
  @Nullable
  public PsiElement getLblDef() {
    return findChildByType(LBL_DEF);
  }

  @Override
  @Nullable
  public PsiElement getSegmentAddrL() {
    return findChildByType(SEGMENT_ADDR_L);
  }

  @Override
  @Nullable
  public PsiElement getZeroes() {
    return findChildByType(ZEROES);
  }

}