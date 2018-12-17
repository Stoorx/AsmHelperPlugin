// This is a generated file. Not intended for manual editing.
package psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMLabel extends PsiElement {

  @Nullable
  NASMData getData();

  @Nullable
  NASMInstruction getInstruction();

  @Nullable
  NASMLabelDefMacro getLabelDefMacro();

  @Nullable
  NASMStructure getStructure();

  @Nullable
  PsiElement getLblDef();

  //WARNING: getLabelIdentifierString(...) is skipped
  //matching getLabelIdentifierString(NASMLabel, ...)
  //methods are not found in NASMPsiImplUtil

}
