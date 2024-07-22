package org.edupro.web.subject.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SubjectReq {

    private String id;

    @NotEmpty(message = "kode wajib di isi")
    @Size(min = 2, max = 10, message = "minimal 2 dan maximal 10")
    private String code;

    @NotEmpty(message = "nama wajib di isi")
    @Size(min = 4, max = 100, message = "nama minimal 4 dan maximal 100")
    private String name;

    @NotEmpty
    @Size(min = 2, max = 36, message = "Type minimal 2 dan maximal 36")
    private String types;
}
