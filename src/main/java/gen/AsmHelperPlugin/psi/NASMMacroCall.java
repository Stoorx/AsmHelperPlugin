// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NASMMacroCall extends NASMExpr {

  @NotNull
  NASMIdentifier getIdentifier();

  @NotNull
  List<NASMNumericExpr> getNumericExprList();

  @Nullable
  PsiElement getSizeType();

}
