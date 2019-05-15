[Demo Model Breakdown](https://www.dropbox.com/s/grh78z2md5csz7c/Breakdown%20Travel%20Booking%20with%20Event%20Subprocess.pdf?dl=0)

## Cawemo

- Book Flight
- Flight
- Cancel Flight
- save as `Cawemo.bpmn`

![Demo Instructions for Cawemo.png](Demo Instructions for Cawemo.png)

## Camunda Modeler

1. Open `BeePMN - Sparx - ARIS - CaseAgile.bpmn`
2. Add an embedded sub-process called:
   - Make Booking
3. Add contents of `Cawemo-ADONIS (pl).bpmn`
4. Add contents of `Trisotech-ITESoft.bpmn`
5. Save as `part-1+2-Camunda.bpmn`

![Demo Instructions for Camunda Modeler.png](Demo Instructions for Camunda Modeler.png)



## Alternative Part for Camunda Modeler

1. Create a new BPMN file

2. Add an embedded sub-process called:

   - Make Booking

3. Add contents of `Cawemo-ADONIS (pl).bpmn`

4. Add contents of `Trisotech-ITESoft.bpmn`

5. Save as `part2-Camunda.bpmn`

   ![Demo Instructions for Camunda Modeler Alternative.png](Demo Instructions for Camunda Modeler Alternative.png)

   

## On the fly checks

`find -iname '*.bpmn' -print0 | xargs -0 -L1 validbpmn`

