public class TallerClase{
    public static void main(String[] args){
        
        double d1 = 42.0;
        double d2 = 58.5;
        double d3 = 37.2;
        double t1 = 0.9;
        double t2 = 1.4;
        double t3 = 0.8;
        double l1 = 5.1;
        double l2 = 6.9;
        double l3 = 4.3;
        double precioLitro = 1.35;
        double masaCargaKg = 1200;
        double largo = 2.0;
        double ancho = 1.2;
        double alto = 1.1;
        double p1 = 2.5;
        double p2 = 3.0;
        double p3 = 2.0;
        double deprecPorKm = 0.08;
        double volCamionM3 = 10.0;
        double volCargaM3 = 10.0;
        double fCO2 = 2.68;
        double galPorLitro = 0.264172;
        double Vmin = 30;
        double Vmax = 90;
        double Va = 40;
        double Vb = 80;
        double Ca = 0.05;
        double Cb = 0.09;
        double a = -0.0008;
        double b = 0.08;
        double c = 4.0;
        // Velocidades y rendimiento
        double V1 = d1/t1;
        double V2 = d2/t2;
        double V3 = d3/t3;
        double Vprom = (d1*V1 + d2*V2 + d3*V3) / (d1 + d2 + d3);
        // Rendimiento por tramo y total (km/litro)
        double kml1 = d1 / l1;
        double kml2 = d2 / l2;
        double kml3 = d3 / l3;
        double kmlTotal = (d1 + d2 + d3) / (l1 + l2 + l3);
        // Costos directos
        double costoComb = (l1 + l2 + l3) * precioLitro;
        double deprec = (d1 + d2 + d3) * deprecPorKm;
        double peajes = p1 + p2 + p3;
        double costoDirecto = costoComb + deprec + peajes;
        double costoPorKm = costoDirecto / (d1 + d2 + d3);
        // Volumen, densidad y ocupación
        double volumenM3 = largo * ancho * alto;
        double densidad = masaCargaKg / volumenM3;
        double ocupacion = volumenM3 / volCamionM3;
        // Emisiones de CO2
        double CO2total = (l1 + l2 + l3) * fCO2;
        double CO2porKm = CO2total / (d1 + d2 + d3);
        // Conversiones y normalizacion
        double Vmsprom = Vprom * 1000/3600;
        double galTot = (l1 + l2 + l3) * galPorLitro; // AÑADIDO
        double vnorm = (Vprom - Vmin) / (Vmax - Vmin); // AÑADIDO
        // Promedios y dispersion
        double Vmedia = (V1 + V2 + V3) / 3;
        double σ = Math.sqrt((Math.pow(V1 - Vmedia, 2) + Math.pow(V2 - Vmedia, 2) + Math.pow(V3 - Vmedia, 2)) / 3);
        double Vpond_t = (t1*V1 + t2*V2 + t3*V3) / (t1 + t2 + t3);
        // Interpolacion lineal
        double cVprom = Ca + (Cb - Ca) * (Vprom - Va) / (Vb - Va);
        double costoMant = cVprom * (d1 + d2 + d3);
        // Modelo Polinomico de rendimiento
        double kmlModelo = a * Math.pow(Vprom, 2) + b * Vprom + c;
        double litrosModelo = (d1 + d2 + d3) / kmlModelo;
        // indice de eficiencia COMPLETO
        double w1 = 0.25;
        double w2 = 0.25;
        double w3 = 0.25;
        double w4 = 0.25;
        double score = w1 * (1/costoPorKm) + w2 * kmlTotal + w3 * (1/CO2porKm) + w4 * (1/(1 + σ));
        // resultados
        System.out.println("V1: " + V1 + " km");
        System.out.println("V2: " +V2 + " km");
        System.out.println("V3: " + V3 + " km");
        System.out.println("Vprom: " + Vprom + " km/h");
        System.out.println("kml1: " + kml1);
        System.out.println("kml2: " + kml2);
        System.out.println("kml3: " + kml3);
        System.out.println("kmlTotal: " + kmlTotal);
        System.out.println("Comb: " + costoComb);
        System.out.println("Depreciación: " + deprec);
        System.out.println("Peajes: " + peajes);
        System.out.println("Costo directo: " + costoDirecto);
        System.out.println("volumen: " + volumenM3 + " m3");
        System.out.println("Densidad: " + densidad + " kg/m3");
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("CO2 total: " + CO2total + " kg");
        System.out.println("CO2 por km: " + CO2porKm + " kg");
        System.out.println("galTotal: " + galTot);
        System.out.println("Vmedia: " + Vmedia);
        System.out.println("Vpond_t: " + Vpond_t);
        System.out.println("σ: " + σ);
        System.out.println("Vnorm: " + vnorm);
        System.out.println("cVprom: " + cVprom);
        System.out.println("costoMant: " + costoMant);
        System.out.println("kmlModelo: " + kmlModelo);
        System.out.println("litrosModelo: " + litrosModelo);
        System.out.println("score: " + score);
    }
}
