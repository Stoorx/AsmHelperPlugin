// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMStruc extends PsiElement {

  @NotNull
  List<NASMIdentifier> getIdentifierList();

  @NotNull
  List<NASMLabelIdentifier> getLabelIdentifierList();

  @NotNull
  List<NASMNumericExpr> getNumericExprList();

  @NotNull
  PsiElement getEndstrucTag();

  @NotNull
  PsiElement getStrucTag();

}