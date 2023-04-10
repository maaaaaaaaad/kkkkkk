package main

import (
	"fmt"
	"time"
)

func printAlph() {
	alph := []rune{'a', 'b', 'c', 'd', 'e'}
	for _, v := range alph {
		time.Sleep(300 * time.Millisecond)
		fmt.Printf("%c\n", v)
	}
}

func printNum() {
	for i := 1; i <= 5; i++ {
		time.Sleep(400 * time.Millisecond)
		fmt.Printf("%d\n", i)
	}
}

func main() {
	go printAlph()
	go printNum()

	time.Sleep(3 * time.Second)
}
