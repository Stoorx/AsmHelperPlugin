// This is a generated file. Not intended for manual editing.
package AsmHelperPlugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMMacroCall extends NASMExpr {

  @NotNull
  NASMIdentifier getIdentifier();

  @NotNull
  List<NASMNumericExpr> getNumericExprList();

  @Nullable
  PsiElement getSizeType();

}
