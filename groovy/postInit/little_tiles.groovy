import gregtech.common.ConfigHolder

crafting.removeByOutput(item('littletiles:ltstorageblocktile'))

if (!ConfigHolder.recipes.hardMiscRecipes) {
crafting.addShapeless('crate_to_storageblock', item('littletiles:ltstorageblocktile'), [metaitem('crate.wood')])
crafting.addShapeless('storageblock_to_crate', metaitem('crate.wood'), [item('littletiles:ltstorageblocktile')])
}
