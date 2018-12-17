// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMMacro extends PsiElement {

  @NotNull
  List<NASMData> getDataList();

  @NotNull
  List<NASMExpr> getExprList();

  @NotNull
  List<NASMInstruction> getInstructionList();

  @NotNull
  List<NASMMacroLabel> getMacroLabelList();

  @NotNull
  List<NASMPreprocessor> getPreprocessorList();

  @Nullable
  PsiElement getMacroEndTag();

  @NotNull
  PsiElement getMacroTag();

  @Nullable
  PsiElement getRegister();

  @Nullable
  PsiElement getString();

  //WARNING: getMacroIdentifier(...) is skipped
  //matching getMacroIdentifier(NASMMacro, ...)
  //methods are not found in NASMPsiImplUtil

}
