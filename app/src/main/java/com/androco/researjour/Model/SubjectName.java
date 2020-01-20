package com.androco.researjour.Model;

public class SubjectName {
    public SubjectName(String subjectName, boolean isChecked) {
        this.subjectName = subjectName;
        this.isChecked = isChecked;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    private String subjectName;
    private boolean isChecked;
}
