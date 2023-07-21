package com.company.audit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;

@Data
public class AuditLog implements Serializable {

    @JsonProperty("entries")
    private Stack<Audit> entries;

    public void addAudit(Audit audit) {
        if (Objects.isNull(this.entries)) {
            this.entries = new Stack<Audit>();
        }
        this.entries.push(audit);
    }
}
