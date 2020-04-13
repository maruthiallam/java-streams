package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamRemoveDuplicateObjects {
    public static void main(String[] args) {
        List<Patient> patient = new ArrayList<>();
        patient.add(new Patient(333, 777,"mockPatient1" ));
        patient.add(new Patient(133, 737,"mockPatient2" ));
        patient.add(new Patient(130, 730,"mockPatient3" ));
        patient.add(new Patient(130, 730,"mockPatient3" ));
        patient.add(new Patient(131, 730,"mockPatient3" ));
        System.out.println("Before:"+patient);
        patient = patient.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("After:"+patient);

    }
}

class Patient implements Comparable<Patient> {
    public long patientId;
    public long encounterId;
    public String name;

    public Patient(long patientId, long encounterId, String name){
        this.patientId = patientId;
        this.encounterId = encounterId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", encounterId=" + encounterId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientId == patient.patientId &&
                encounterId == patient.encounterId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, encounterId);
    }

    @Override
    public int compareTo(Patient other) {
        final int nameComparision = name.compareToIgnoreCase(other.name);
        if(nameComparision != 0){
            return nameComparision;
        }
        final int patientIdComparision = Long.compare(patientId, other.patientId);
        if(patientIdComparision != 0){
            return patientIdComparision;
        }
        return Long.compare(encounterId, other.encounterId);
    }
}
