// This is a generated file. Not intended for manual editing.
package gen.AsmHelperPlugin.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NASMMacroLabel extends PsiElement {

  @Nullable
  NASMData getData();

  @Nullable
  NASMInstruction getInstruction();

  @NotNull
  PsiElement getMacroParamLblDef();

}
