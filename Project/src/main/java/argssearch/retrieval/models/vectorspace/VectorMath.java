package argssearch.retrieval.models.vectorspace;

/**
 * Math class for vector operations
 */
public class VectorMath {


    public static double dotProduct(final Vector l, final Vector r) {
        if (l.getSize() != r.getSize()) {
            throw new ArrayIndexOutOfBoundsException("Vectors must be of same size.");
        }

        double sum = 0;
        for (int i = 0; i < l.getSize(); i++) {
            sum += l.get(i) * r.get(i);
        }

        return sum;
    }

    /**
     * Computes the cosine similarity of two vectors.
     * See: https://en.wikipedia.org/wiki/Vector_space_model#Applications
     *
     * @param l left vector
     * @param r right vector
     * @return cosine similarity of two vectors.
     */
    public static double getCosineSimilarity(final Vector l, final Vector r) {
        if (l.getSize() != r.getSize()) {
            throw new ArrayIndexOutOfBoundsException("Vectors must be of same size.");
        }

        double sim = dotProduct(l, r) / (l.norm() * r.norm());

        return Double.isNaN(sim) ? -1 : sim;
    }
}