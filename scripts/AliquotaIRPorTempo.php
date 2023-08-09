<?php

$date = new DateTime('now', new DateTimeZone('America/Sao_Paulo'));

$range1 = clone $date;
$range1 = $range1->add(new DateInterval('P180D'));

$range2 = clone $date;
$range2 = $range2->add(new DateInterval('P360D'));

$range3 = clone $date;
$range3 = $range3->add(new DateInterval('P720D'));

$range4 = clone $date;
$range4 = $range4->add(new DateInterval('P721D'));

echo "Até a  data de {$range1->format('d/m/Y')} a aliquota do IR incidente sobre o investimento será de 22.50%" . PHP_EOL;
echo "Até a  data de {$range2->format('d/m/Y')} a aliquota do IR incidente sobre o investimento será de 20.00%" . PHP_EOL;
echo "Até a  data de {$range3->format('d/m/Y')} a aliquota do IR incidente sobre o investimento será de 17.50%" . PHP_EOL;
echo "A partir de {$range4->format('d/m/Y')} a aliquota do IR incidente sobre o investimento será de 15.00%" . PHP_EOL;
