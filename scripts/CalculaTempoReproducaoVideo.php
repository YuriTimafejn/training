<?php

echo "Enter the total time of the video (in minutes)" . PHP_EOL;
$videoInMinutes = fgets(STDIN);


for ($i = 0.5; $i <= 2; $i += 0.5) {
    $timeNecessary = $videoInMinutes / $i;
    echo "In ratio tax {$i}X the time necessary to finish is: $timeNecessary" . PHP_EOL;
}
