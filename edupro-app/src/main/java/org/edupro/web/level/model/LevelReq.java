package org.edupro.web.level.model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LevelReq {
    private String id;

    @NotEmpty(message = "Lembaga Tidak Boleh Kosong")
    private String institutionId;

    @NotEmpty(message = "Kode Tidak Boleh Kosong")
    @Size(min = 1, max = 10, message = "Kode Minimal 1 dan Maksimal 10")
    private String code;

    @NotEmpty(message = "Nama Tidak Boleh Kosong")
    @Size(min = 2, max = 100, message = "Nama Minimal 2 dan Maksimal 100")
    private String name;

    @NotNull(message = "No-Urut Tidak Boleh Kosong")
    private Integer position;
}
