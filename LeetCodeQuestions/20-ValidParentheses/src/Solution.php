<?php

class Solution {

    /**
     * @param String $s
     * @return Boolean
     */
    public function isValid($s): bool {
        $expected = [
            "(" => ")",
            "[" => "]",
            "{" => "}"
        ];
        
        $save = [];
        
        for ($i = 0; $i < strlen($s); $i++) {
            if (isset($expected[$s[$i]])) {
                array_push($save, $expected[$s[$i]]);
                continue;
            }
            
            if (array_pop($save) != $s[$i]) {
                return false;
            }
        }
        
        return empty($save);
    }
}

?>