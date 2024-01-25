package pl.roka.it.lesson3;

import java.util.Arrays;

public class NeuralNetwork {
    public static void main(String[] args) {

        double [] inp = new double[]{15, 1, 4};
        double [] weightsNew = new double[]{0.1788220683971064, 0.4022520590970602, 0.9103219375281926};
        double goalPredicate = 2.6;

        double resultNew = neuralnetwork(inp, weightsNew);

        System.out.println(resultNew);

//        double alpha = 0.01;
//        for (int iteration = 0; iteration < 30; iteration++) {
//            double pred = neuralnetwork(inp, weights);
//            double delta = goalPredicate - pred;
//            double error = delta * delta;
//
//            double[] weightsDelta = new double[weights.length];
//
//            for (int i = 0; i < weightsDelta.length; i++) {
//                weightsDelta[i] = delta * inp[i];
//            }
//
//            System.out.println("Iteration: " + iteration);
//            System.out.println("Pred: " + pred);
//            System.out.println("Delta: " + delta);
//            System.out.println("WeightsDelta: ");
//            for (int i = 0; i < weightsDelta.length; i++) {
//                System.out.print("[" + i + "]: " + weightsDelta[i]);
//            }
//            System.out.println();
//
//            for (int i = 0; i < weights.length; i++) {
//                weights[i] += alpha * weightsDelta[i];
//            }
//
//        }
//        System.out.println("Weight: ");
//        for (int i = 0; i < weights.length ; i++) {
//            System.out.println("weights[" + i + "]:" + weights[i] + ", ");
//        }
    }

    public static double neuralnetwork(double[] inp, double[] weights) {
        double result = 0;
        for (int i = 0; i < inp.length; i++) {
            result += inp[i] * weights[i];
        }
        return result;
    }

}
