package nl.bioinf;

import java.util.ArrayList;

public record MethylationData(String probe, String gene, ArrayList<Double> betaValues) {
}
